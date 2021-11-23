@com.jfinal.aop.Before(value = io.jpress.interceptor.UCodeInterceptor.class)
public void menudel() {
    java.math.BigInteger id = getParaToBigInteger("id");
    if (id != null) {
        if (Content.DAO.deleteById(id)) {
            renderAjaxResultForSuccess();
        }
    }
    renderAjaxResultForError();
}