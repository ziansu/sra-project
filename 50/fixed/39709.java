private retrofit2.Call<java.lang.String> getApiFromApiType(int apiType, java.util.Map<java.lang.String, java.lang.String> extraParams) {
    switch (apiType) {
        case NetworkConstants.API_FETCH_APPOINTMENT_SLOTS :
            return apiService.fetchAppointmentSlots(extraParams);
    }
    return null;
}