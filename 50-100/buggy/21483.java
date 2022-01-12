private void triggerBeforeHostChildRemoved(org.zkoss.zk.ui.Component child) {
    java.util.List<org.zkoss.zk.ui.ShadowElement> shadowRoots = getShadowRoots();
    if (!(shadowRoots.isEmpty())) {
        try {
            initIndexCacheMap();
            final int indexOf = getChildren().indexOf(child);
            for (org.zkoss.zk.ui.ShadowElement se : getShadowRoots()) {
                if (se instanceof org.zkoss.zk.ui.ShadowElementCtrl) {
                    ((org.zkoss.zk.ui.ShadowElementCtrl) (se)).beforeHostChildRemoved(child, indexOf);
                }
            }
        } finally {
            destroyIndexCacheMap();
        }
    }
}