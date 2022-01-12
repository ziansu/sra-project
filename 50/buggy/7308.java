@org.apache.ibatis.annotations.Insert(value = "INSERT INTO tb_stock(id, name, price) VALUES(#{id}, #{name}, #{price})")
public int insertStock(@org.apache.ibatis.annotations.Param(value = "id")
java.lang.String id, @org.apache.ibatis.annotations.Param(value = "name")
java.lang.String name, @org.apache.ibatis.annotations.Param(value = "price")
float price);