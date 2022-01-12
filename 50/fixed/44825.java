@org.apache.ibatis.annotations.Select(value = "select h.id from prescription as p, hospital as h " + "where p.process = #{process} and p.hospital_id = h.id")
java.util.List<java.lang.Integer> listInProgressHospitalwithProcess(@org.apache.ibatis.annotations.Param(value = "process")
int process);