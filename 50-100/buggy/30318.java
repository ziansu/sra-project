@java.lang.Override
public cw3.SampleableList sample() {
    cw3.SampleableList mySampledList = new cw3.SampleableListImpl();
    for (int i = 0; i < (this.size()); i++) {
        if ((i % 2) == 1) {
            mySampledList.add(this.get(i));
        }
    }
    return mySampledList;
}