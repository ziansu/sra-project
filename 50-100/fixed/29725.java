private void attachHeaderForStart(android.view.View header, com.tonicartos.superslim.SectionData2 sd, com.tonicartos.superslim.LayoutState state) {
    if ((state.getCachedView(sd.firstPosition)) != null) {
        addView(header, ((findLastIndexForSection(sd.firstPosition)) + 1));
        state.decacheView(sd.firstPosition);
    }
}