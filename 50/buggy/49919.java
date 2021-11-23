@java.lang.Override
public void onClick(android.view.View v) {
    AnimationSupport.Reveal.openFromLeft(LLcontainerSBvolume, new com.android.simplemusic.Support.AnimationSupport.Reveal.AnimationAction() {
        @java.lang.Override
        public void onPrepare() {
            RFLcontainerSBvolume.setVisibility(View.VISIBLE);
        }

        @java.lang.Override
        public void onStart() {
        }
    });
}