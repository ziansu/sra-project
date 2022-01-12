@android.databinding.BindingAdapter(value = { "app:photoUrl" })
public static void loadImage(android.widget.ImageView view, java.lang.String url) {
    if (url.equals(ConstantsFirebase.FIREBASE_LOCATION_CHAT_GLOBAL)) {
        view.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.ic_chat_global));
    }else {
        com.ygorcesar.jamdroidfirechat.utils.Utils.loadImageWithPicasso(view.getContext(), view, url, R.drawable.ic_person);
    }
}