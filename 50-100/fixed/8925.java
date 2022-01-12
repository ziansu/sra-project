private void init() {
    com.shinav.mathapp.injection.component.Injector.getViewComponent(this.getContext()).inject(this);
    int layout = getLayout(cutsceneLine);
    android.view.View view = inflate(layout, this, false);
    holder = new com.shinav.mathapp.cutscene.CutsceneLineView.ViewHolder(view);
    loadCharacterImage(cutsceneLine);
    holder.line_value.setVisibility(com.shinav.mathapp.cutscene.INVISIBLE);
    addView(view);
}