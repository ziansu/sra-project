@java.lang.Override
public boolean onException(java.lang.Exception e, java.lang.Object model, com.bumptech.glide.request.target.Target target, boolean isFirstResource) {
    listener.onError();
    return false;
}