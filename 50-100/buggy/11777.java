@java.lang.Override
public void onPageSelected(int position) {
    switch (position) {
        case 0 :
            findViewById(R.id.gameRelativeLayout).setVisibility(View.VISIBLE);
            mSetGridView.setVisibility(View.INVISIBLE);
            break;
        case 1 :
            findViewById(R.id.gameRelativeLayout).setVisibility(View.INVISIBLE);
            mSetGridView.setVisibility(View.VISIBLE);
            populateSetGridView();
            break;
        case 2 :
            android.widget.Toast.makeText(this, "Coming Soon ;)", Toast.LENGTH_SHORT).show();
    }
}