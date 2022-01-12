public void save(li.itcc.hackathon15.services.PoiDetailBean bean) {
    new li.itcc.hackathon15.poiadd.PoiAddSaver.SaveTask().execute(bean);
}