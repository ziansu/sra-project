@java.lang.Override
public int compare(java.lang.String lhs, java.lang.String rhs) {
    android.util.Log.d(com.carl.cocos2d.animation.SpriteSheetAnimationAdapter.TAG, java.lang.String.format("lhs %s, rhs %s, lhs.length() - rhs.length(): %d", lhs, rhs, ((lhs.length()) - (rhs.length()))));
    if ((lhs.length()) != (rhs.length())) {
        return (lhs.length()) - (rhs.length());
    }else {
        return lhs.compareTo(rhs);
    }
}