@java.lang.Override
public void showCars(com.automotive.hhi.mileagetracker.adapters.CarAdapter cars) {
    mCarRecyclerView.setAdapter(cars);
    cars.notifyDataSetChanged();
}