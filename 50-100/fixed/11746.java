private void setMedian() {
    if (!(this.numbers.isEmpty())) {
        int mid = (this.numbers.size()) / 2;
        if ((mid % 2) == 1) {
            this.medianOfAllNumbers = this.numbers.get(mid);
        }else {
            this.medianOfAllNumbers = ((this.numbers.get((mid - 1))) + (this.numbers.get(mid))) / 2.0;
        }
    }
}