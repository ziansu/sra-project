public java.lang.Object getItem(int position) {
    com.oneplus.base.Log.d(com.oneplus.gallery.TAG, ("getItem position: " + position));
    if (position == 0) {
        com.oneplus.base.Log.d(com.oneplus.gallery.TAG, "getItem 0");
    }else {
        if ((m_MediaList) != null)
            return m_MediaList.get(position);
        else
            return null;
        
    }
    return null;
}