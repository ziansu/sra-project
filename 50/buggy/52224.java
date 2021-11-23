@org.springframework.web.bind.annotation.RequestMapping(value = "/getUserById")
@org.springframework.web.bind.annotation.ResponseBody
public com.ccloomi.web.demo.entity.TestUser getUserById(java.io.Serializable id) {
    return this.testUserService.getUserById(id);
}