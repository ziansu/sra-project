@java.lang.Override
public void onAddInterest(sk.beacode.beacodeapp.models.Interest interest) {
    if ((user) != null) {
        if ((user.getInterests()) != null) {
            user.getInterests().add(0, interest);
        }
        myProfileFragment.bind(user);
        onAddInterestBackground(interest);
    }
}