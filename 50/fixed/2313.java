@java.lang.Override
public com.taobao.rigel.rap.project.bo.Action getAction(long id) {
    return ((com.taobao.rigel.rap.project.bo.Action) (getSession().get(com.taobao.rigel.rap.project.bo.Action.class, id)));
}