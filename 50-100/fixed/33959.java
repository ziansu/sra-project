@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case com.dangerducks.cookit.MainActivity.RECIPE_ACTIVITY :
            if (resultCode == (com.dangerducks.cookit.MainActivity.RECIPE_REMOVED)) {
            }else
                if (resultCode == (com.dangerducks.cookit.MainActivity.RECIPE_FAVED)) {
                    adapter.notifyDataSetChanged();
                }
            
            break;
    }
}