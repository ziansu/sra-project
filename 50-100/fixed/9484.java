protected final void provision(android.support.v4.app.Fragment fragment, java.lang.String json) {
    android.os.Bundle args = new android.os.Bundle();
    args.putString(EntityFragment.ARG_JSON, json);
    args.putString(EntityFragment.ARG_ENTITY, ("" + (entityType)));
    fragment.setArguments(args);
}