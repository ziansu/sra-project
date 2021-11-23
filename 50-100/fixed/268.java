public static asu.reach.DialogBuilder newInstance(java.lang.String title, asu.reach.Safe a) {
    asu.reach.DialogBuilder frag = new asu.reach.DialogBuilder();
    android.os.Bundle args = new android.os.Bundle();
    args.putString("title", title);
    frag.setArguments(args);
    asu.reach.DialogBuilder.safeActivity = a;
    asu.reach.DialogBuilder.sticActivity = null;
    asu.reach.DialogBuilder.whActivity = null;
    asu.reach.DialogBuilder.landingActivity = null;
    asu.reach.DialogBuilder.stopActivity = null;
    asu.reach.DialogBuilder.ddActivity = null;
    asu.reach.DialogBuilder.ddActivity = null;
    return frag;
}