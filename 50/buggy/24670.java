@java.lang.Override
public void onClick(android.view.View view) {
    changeNavigationHeader(((android.widget.TextView) (findViewById(R.id.tvNavHeader))).getText().toString());
    popBackStack();
    if (shouldShowLogo()) {
        setUpInitStateOfMenu();
    }
}