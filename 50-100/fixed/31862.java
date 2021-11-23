private void saveMapping() {
    de.greenrobot.event.EventBus.getDefault().post(new com.mozidev.testopengl.network.BusEvent(com.mozidev.testopengl.network.Command.mappingFinishGL));
    new com.mozidev.testopengl.CreatorObjFile().create(getContext(), mObjects);
    ((com.mozidev.testopengl.activity.MappingActivity) (getContext())).finish();
}