public static com.software.digitals.posterwizard.WallpaperDetailsFragment newInstance(int imageResId, java.lang.String name, java.lang.String url) {
    final android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.software.digitals.posterwizard.WallpaperDetailsFragment.ARGUMENT_IMAGE_RES_ID, imageResId);
    args.putString(com.software.digitals.posterwizard.WallpaperDetailsFragment.ARGUMENT_NAME, name);
    args.putString(com.software.digitals.posterwizard.WallpaperDetailsFragment.ARGUMENT_URL, url);
    final com.software.digitals.posterwizard.WallpaperDetailsFragment fragment = new com.software.digitals.posterwizard.WallpaperDetailsFragment();
    fragment.setArguments(args);
    return fragment;
}