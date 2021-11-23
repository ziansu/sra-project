@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    context = getActivity();
    dialogMessage = new ir.rasen.charsoo.view.dialog.DialogMessage(context, "");
    ir.rasen.charsoo.view.fragment.invite.FragmentInvite.charsooActivityContext = ((ir.rasen.charsoo.view.widgets.charsoo_activity.CharsooActivity) (getActivity()));
    view = inflater.inflate(R.layout.fragment_invite, container, false);
    ir.rasen.charsoo.view.fragment.invite.FragmentInvite.charsooActivityContext.showWaitDialog();
    if (ir.rasen.charsoo.view.activity.business.ActivityBusinessRegister.isComesFromBusinessEditPage)
        view.findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
    
    networkFailedLayout = ir.rasen.charsoo.controller.object.MyApplication.initNetworkErrorLayout(view, getActivity(), this);
    return view;
}