public void setData(com.bruce.open.mortgage.Model.EveryPayInfo[] infos, int type) {
    this.infos = infos;
    this.type = type;
    notifyDataSetChanged();
}