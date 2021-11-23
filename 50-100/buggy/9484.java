protected final void provision(android.support.v4.app.Fragment fragment, int idx) {
    android.os.Bundle args = new android.os.Bundle();
    java.lang.String json = (idx >= 0) ? jsonList.get(idx) : "{}";
    args.putString(EntityFragment.ARG_JSON, json);
    args.putString(EntityFragment.ARG_ENTITY, ("" + (entityType)));
    fragment.setArguments(args);
}