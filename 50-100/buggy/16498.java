public void stimmungtest1() throws java.lang.Exception {
    com.example.mb7.sportappbp.BusinessLayer.StimmungAbfrage teststimmung = new com.example.mb7.sportappbp.BusinessLayer.StimmungAbfrage();
    teststimmung.Date = "20170101";
    teststimmung.Vor = true;
    teststimmung.Angespannt = 0;
    teststimmung.Mitteilsam = 0;
    teststimmung.Muede = 0;
    teststimmung.Selbstsicher = 0;
    teststimmung.Tatkraeftig = 0;
    teststimmung.Traurig = 0;
    teststimmung.Wuetend = 0;
    teststimmung.Zerstreut = 0;
    Testperson1.SaveStimmung(teststimmung);
}