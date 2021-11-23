public void initializeUsers() {
    rob_array = getResources().getStringArray(R.array.rob);
    hooman_array = getResources().getStringArray(R.array.hooman);
    arjun_array = getResources().getStringArray(R.array.arjun);
    rob = new ipt341.zarrabi.hooman.a5.User(rob_array, R.drawable.rob_pic);
    arjun = new ipt341.zarrabi.hooman.a5.User(arjun_array, R.drawable.arjun_pic);
    hooman = new ipt341.zarrabi.hooman.a5.User(hooman_array, R.drawable.hooman_pic);
}