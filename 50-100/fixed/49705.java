private android.view.View inflateLayout(android.content.Context context, android.view.LayoutInflater inflater) {
    java.lang.String layoutToSearch = com.raxdenstudios.commons.util.StringUtils.join(com.raxdenstudios.commons.util.StringUtils.uncapitalize(context.getClass().getSimpleName()).split("(?=\\p{Upper})"), "_").toLowerCase(java.util.Locale.getDefault());
    int layoutId = com.raxdenstudios.commons.util.ResourceUtils.getLayoutId(context, layoutToSearch);
    if (layoutId > 0) {
        return inflater.inflate(layoutId, null);
    }
    return null;
}