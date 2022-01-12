private void saveMapping() {
    de.greenrobot.event.EventBus.getDefault().post(new com.mozidev.testopengl.network.BusEvent(com.mozidev.testopengl.network.Command.mappingFinishGL));
    getContext().stopService(new android.content.Intent(this.getContext(), com.mozidev.testopengl.service.SocketService.class));
    new com.mozidev.testopengl.CreatorObjFile().create(getContext(), mObjects);
    ((com.mozidev.testopengl.activity.MappingActivity) (getContext())).finish();
}