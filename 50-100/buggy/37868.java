private void splitStrokeAtFeaturePoints(com.js.gest.Stroke origStroke) {
    mSplitStrokeList = new java.util.ArrayList();
    if (true) {
        unimp("splitStrokeAtFeaturePoints: cutting in two");
        int q = (origStroke.length()) / 2;
        mSplitStrokeList.add(origStroke.constructFragment(0, (1 + q)));
        mSplitStrokeList.add(origStroke.constructFragment(q, origStroke.length()));
        return ;
    }
    unimp("splitStrokeAtFeaturePoints: determine which points are feature points");
    mSplitStrokeList.add(origStroke);
}