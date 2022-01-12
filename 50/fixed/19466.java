@java.lang.Override
protected bg.unisofia.fmi.valentinalatinova.core.dto.ResultDto doInBackground(java.lang.Long... params) {
    bg.unisofia.fmi.valentinalatinova.app.HttpClient client = bg.unisofia.fmi.valentinalatinova.app.MainActivity.getHttpClient();
    return client.get(((PATH_DELETE) + (params[0])), bg.unisofia.fmi.valentinalatinova.core.dto.ResultDto.class);
}