public static com.peacecorps.pcsa.circle_of_trust.ContactListDialog newInstance(final android.content.Context context, final java.lang.String title, final java.lang.Object[] elements) {
    android.os.Bundle args = new android.os.Bundle();
    args.putString("title", title);
    com.peacecorps.pcsa.circle_of_trust.ContactListDialog fragment = new com.peacecorps.pcsa.circle_of_trust.ContactListDialog();
    fragment.context = context;
    fragment.setArguments(args);
    fragment.elements = elements;
    return fragment;
}