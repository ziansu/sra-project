@java.lang.Override
public void onClick(android.view.View v) {
    removeCover();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            searchView.setVisibility(View.INVISIBLE);
            imageViewUnderLine.setVisibility(View.INVISIBLE);
            RemoveUnderLine();
            searchView.setText("");
            resetDropdownOffset = true;
            imageViewHome.setImageResource(R.drawable.menu);
            isSearchViewShown = false;
            if (isAppBarFolded) {
                textTitle.setVisibility(View.VISIBLE);
                imageViewHome.setImageResource(R.drawable.menu_b);
            }
        }
    }, 200);
}