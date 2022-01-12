@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.second_frag, container, false);
    currentCarIndex = getArguments().getInt("current_car", 0);
    currentCar = com.twild.gastracker.ActivityListOfCars.carList.get(currentCarIndex);
    return v;
}