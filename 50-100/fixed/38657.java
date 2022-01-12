public void addNewContent(java.lang.String type) {
    if (type != null) {
        if (type.contains(org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.COURSE)) {
            setTabItems(1, org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.COURSE, null);
            setUnitTemplate(org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.COURSE);
        }else
            if (type.contains(org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.UNIT)) {
                setTabItems(1, org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.UNIT, null);
                setUnitTemplate(org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.UNIT);
            }else
                if (type.contains(org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.LESSON)) {
                    setTabItems(1, org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.LESSON, null);
                    setUnitTemplate(org.ednovo.gooru.client.mvp.gshelf.righttabs.MyCollectionsRightClusterPresenter.LESSON);
                }
            
        
    }
}