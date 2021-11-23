@java.lang.Override
protected java.util.List<bg.unisofia.fmi.valentinalatinova.core.dto.MobileScheduleDto> doInBackground(java.lang.String... params) {
    bg.unisofia.fmi.valentinalatinova.app.HttpClient client = bg.unisofia.fmi.valentinalatinova.app.MainActivity.getHttpClient();
    bg.unisofia.fmi.valentinalatinova.core.dto.MobileScheduleDto[] schedulesArray = client.get(PATH_SCHEDULES, bg.unisofia.fmi.valentinalatinova.core.dto.MobileScheduleDto[].class);
    java.util.List<bg.unisofia.fmi.valentinalatinova.core.dto.MobileScheduleDto> result = new java.util.ArrayList<>();
    java.util.Collections.addAll(result, schedulesArray);
    return result;
}