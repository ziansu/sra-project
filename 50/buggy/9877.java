@org.apache.ibatis.annotations.Select(value = "SELECT IF((SELECT kode_irs FROM irs WHERE npm = #{npm} AND id_kalender_akademik = #{id_kalender_akademik}) IS NOT NULL," + " (SELECT kode_irs FROM irs WHERE npm = #{npm} AND id_kalender_akademik = #{id_kalender_akademik}),0)")
long selectKode_irs(@org.apache.ibatis.annotations.Param(value = "npm")
java.lang.String npm, @org.apache.ibatis.annotations.Param(value = "id_kalender_akademik")
int id_kalender_akademik);