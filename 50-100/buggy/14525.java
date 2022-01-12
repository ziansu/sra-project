@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (((requestCode == (POST_FLAG)) && (resultCode == (POST_FLAG))) && ((viewPager.getCurrentItem()) == 0)) {
        android.util.Log.d("TEST", "activity result");
        pagerAdapter.getAllFragment().getPostList(communityID);
        return ;
    }
    android.widget.Toast.makeText(getApplicationContext(), "글 목록을 불러오는데 실패했습니다.", Toast.LENGTH_SHORT).show();
}