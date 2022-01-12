@java.lang.Override
public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
    deleteItem(id);
    content = "";
    getActivity().getSupportFragmentManager().popBackStack("editor", FragmentManager.POP_BACK_STACK_INCLUSIVE);
}