public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            getNavigationActivity().openPostLikesActivity(post);
            break;
        case 1 :
            if ((isFullView) && (post.isDeletable()))
                deletePost(post);
            else
                getNavigationActivity().openPostPage(post, false);
            
            break;
        case 2 :
            deletePost(post);
            break;
        default :
            break;
    }
}