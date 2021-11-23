@java.lang.Override
public void onUpdateCityStateUserHadFinished() {
    java.lang.String nameState = states.get(stateOptionStates);
    MockSingleton.INSTANCE.user.setCity(cityOptionCities);
    MockSingleton.INSTANCE.user.setState(stateOptionStates);
    MockSingleton.INSTANCE.userChangeCity = cityOptionCities;
    MockSingleton.INSTANCE.userChangeState = stateOptionStates;
    br.edu.ifce.swappers.swappers.miscellaneous.SwappersToast.makeText(getActivity(), (((((getString(R.string.change_city_dialog_positive_button_parcial_message)) + " ") + (cityOptionCities)) + ",") + (stateOptionStates)), Toast.LENGTH_SHORT).show();
    br.edu.ifce.swappers.swappers.miscellaneous.utils.AndroidUtils.saveCityState(getActivity(), cityOptionCities, stateOptionStates);
    MockSingleton.INSTANCE.nearBooks.clear();
}