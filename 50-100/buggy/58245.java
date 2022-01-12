private void triggerBeforeHostParentChanged(org.zkoss.zk.ui.Component parent) {
    java.util.List<org.zkoss.zk.ui.ShadowElement> shadowRoots = getShadowRoots();
    if (!(shadowRoots.isEmpty())) {
        try {
            initIndexCacheMap();
            for (org.zkoss.zk.ui.ShadowElement se : getShadowRoots()) {
                if (se instanceof org.zkoss.zk.ui.ShadowElementCtrl) {
                    ((org.zkoss.zk.ui.ShadowElementCtrl) (se)).beforeHostParentChanged(parent);
                }
            }
        } finally {
            destroyIndexCacheMap();
        }
    }
}