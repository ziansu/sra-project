@java.lang.Override
public void onBackPressed() {
    if (linearLayout_before.isShown()) {
        linearLayout_before.setVisibility(View.INVISIBLE);
        return ;
    }else
        if (linearLayout_show.isShown()) {
            linearLayout_show.setVisibility(View.INVISIBLE);
            return ;
        }else
            if (videoController.isShown()) {
                videoController.contentInvisible();
                return ;
            }
        
    
    super.onBackPressed();
}