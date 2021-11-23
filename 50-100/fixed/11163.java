private void makeURL() {
    java.lang.String URL = (MainActivity2.URL) + (MainActivity2.USN);
    android.content.Intent i = new android.content.Intent(getActivity(), com.teamidentiti.fastvturesults.Services.SemestersService.class);
    i.putExtra("URL", URL);
    i.putExtra("USN", MainActivity2.USN);
    getActivity().startService(i);
}