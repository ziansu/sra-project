@org.junit.Test
public void test() {
    org.immregistries.smm.transform.procedure.AnonymizeAndUpdateRecord.setAsOfDate("20161109");
    test(org.immregistries.smm.transform.procedure.AnonymizeAndUpdateRecordTest.MSH_ORIG, org.immregistries.smm.transform.procedure.AnonymizeAndUpdateRecordTest.MSH_NEW);
    test("MSH|^~\\&|||||20160805||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r", "MSH|^~\\&|||||20161108||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r");
    test("MSH|^~\\&|||||20160805102500||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r", "MSH|^~\\&|||||20161108102500||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r");
    test("MSH|^~\\&|||||20160805102500-0600~Hello!||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r", "MSH|^~\\&|||||20161108102500-0600~Hello!||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r");
    test("MSH|^~\\&|||||||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r", "MSH|^~\\&|||||||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r");
    test("MSH|^~\\&|||||20160805102500-0600&||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r", "MSH|^~\\&|||||20161108102500-0600&||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r");
    test("MSH|^~\\&|||||20160805102500-0600^||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r", "MSH|^~\\&|||||20161108102500-0600^||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r");
    test("MSH|^~\\&|||||20160805102500-0600^~&||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r", "MSH|^~\\&|||||20161108102500-0600^~&||VXU^V04^VXU_V04|1cuT-A.01.01.3n|P|2.5.1|||ER|AL|||||Z22^CDCPHINVS\r");
    test(((org.immregistries.smm.transform.procedure.AnonymizeAndUpdateRecordTest.MSH_ORIG) + "PID|1||1234^^^AIRA-TEST^MR||Pecos^Sawyer^K^^^^L|Marion^Valisa^^^^^M|20120725|F||2106-3^White^CDCREC|350 Greene Cir^^Little Lake^MI^49833^USA^P||^PRN^PH^^^906^3464569|||||||||2186-5^not Hispanic or Latino^CDCREC||N||||||N"), ((org.immregistries.smm.transform.procedure.AnonymizeAndUpdateRecordTest.MSH_NEW) + "PID|1||1234^^^AIRA-TEST^MR||Pecos^Sawyer^K^^^^L|Marion^Valisa^^^^^M|20120725|F||2106-3^White^CDCREC|350 Greene Cir^^Little Lake^MI^49833^USA^P||^PRN^PH^^^906^3464569|||||||||2186-5^not Hispanic or Latino^CDCREC||N||||||N"));
}