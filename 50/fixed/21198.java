@org.apache.ibatis.annotations.Update(value = "UPDATE \"tokens\" SET \"token\" = #{token} where \"username\"= #{userName}")
public int updateToken(@org.apache.ibatis.annotations.Param(value = "token")
java.lang.String token, @org.apache.ibatis.annotations.Param(value = "userName")
java.lang.String userName);