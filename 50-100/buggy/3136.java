public com.forgerock.opendj.cli.MenuResult<T> invoke(com.forgerock.opendj.cli.ConsoleApplication app) throws com.forgerock.opendj.cli.ClientException {
    java.util.List<T> values = new java.util.ArrayList<T>();
    for (com.forgerock.opendj.cli.MenuCallback<T> callback : callbacks) {
        com.forgerock.opendj.cli.MenuResult<T> result = callback.invoke(app);
        if (!(result.isSuccess())) {
            return result;
        }else {
            values.addAll(result.getValues());
        }
    }
    return com.forgerock.opendj.cli.MenuResult.success(values);
}