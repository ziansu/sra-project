public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            if ((isFullView) && (post.isDeletable()))
                deletePost(post);
            else
                getNavigationActivity().openPostPage(post, false);
            
            break;
        case 1 :
            deletePost(post);
            break;
        default :
            break;
    }
}