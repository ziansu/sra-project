@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 2 :
            {
                me.ccrama.redditslide.util.LinkUtil.openExternally(contentUrl, this, false);
            }
            break;
        case 3 :
            {
                shareImage(contentUrl);
            }
            break;
        case 5 :
            {
                me.ccrama.redditslide.Reddit.defaultShareText("", contentUrl, this);
            }
            break;
        case 4 :
            {
                doImageSave(isGif, contentUrl, index);
            }
            break;
    }
}