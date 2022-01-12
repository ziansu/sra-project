public static com.izik.recipebook.Model instance(android.content.Context context) {
    if (context instanceof com.izik.recipebook.Model.OnModelCompletedOperationListener) {
        com.izik.recipebook.Model.mListener = ((com.izik.recipebook.Model.OnModelCompletedOperationListener) (context));
    }else {
        throw new java.lang.RuntimeException(((context.toString()) + " must implement OnFragmentInteractionListener"));
    }
    com.izik.recipebook.Model.mContext = context;
    return com.izik.recipebook.Model.instance;
}