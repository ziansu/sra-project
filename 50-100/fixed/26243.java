@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.ustadmobile.port.android.view.ContainerPageFragment existingFrag = pagesMap.get(new java.lang.Integer(position));
    if (existingFrag != null) {
        return existingFrag;
    }else {
        com.ustadmobile.port.android.view.ContainerPageFragment frag = com.ustadmobile.port.android.view.ContainerPageFragment.newInstance(hrefList[position], position);
        this.pagesMap.put(java.lang.Integer.valueOf(position), frag);
        return frag;
    }
}