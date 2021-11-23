@java.lang.Override
public void transformContext() {
    if (((getOwner()) != null) && (EssenciaContext.ESSENCE_KERNEL.equals(getOwner().getName()))) {
        org.uengine.essencia.util.ContextUtil.setWhen(this, EssenciaContext.WHEN_VIEW);
        org.uengine.essencia.util.ContextUtil.setWhen(getListFace(), EssenciaContext.WHEN_VIEW);
    }else {
        org.uengine.essencia.util.ContextUtil.setWhen(this, EssenciaContext.WHEN_EDIT);
    }
}