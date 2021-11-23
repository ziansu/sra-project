@java.lang.Override
protected void handleResponse(net.dv8tion.jda.core.entities.impl.Response response, net.dv8tion.jda.core.entities.impl.Request request) {
    if (response.isOk()) {
        net.dv8tion.jda.core.entities.impl.Message m = net.dv8tion.jda.core.entities.impl.EntityBuilder.get(getJDA()).createMessage(response.getObject());
        request.onSuccess(m);
    }else {
        request.onFailure(response);
    }
}