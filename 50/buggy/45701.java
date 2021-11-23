private MC4DView.ItemCompleteCallback makeLabeler(final java.lang.String label) {
    return new com.superliminal.magiccube4d.MC4DView.ItemCompleteCallback() {
        @java.lang.Override
        public void onItemComplete(com.superliminal.magiccube4d.MagicCube.TwistData twist) {
            setStatus(label);
        }
    };
}